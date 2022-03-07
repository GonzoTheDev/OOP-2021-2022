package ie.tudublin;

import processing.core.PApplet;

public class LifeBoard {
    boolean[][] board, next;
    int size;
    float cellSize;
    PApplet pa;
    int colour = 0;

    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    

    public LifeBoard(int size, PApplet pa)
    {
        board = new boolean[size][size];
        next = new boolean[size][size];
        this.size = size;
        this.pa = pa;
        cellSize = pa.width / (float) size;
    }

    public void randomise()
    {
        for(int row = 0 ; row < size ; row ++)
        {
            for(int col = 0 ; col < size ; col ++)
            {
                board[row][col] = pa.random(1.0f) > 0.5f;
            }
        }
    }

    public void update()
    {
        // If cell is alive
        // and has 2 or 3 live neighbors, stays alive else kill it

        // If cell is dead and has 3 neighbors, cell comes to life

        for(int row = 0 ; row < size ; row ++)
        {
            for(int col = 0 ; col < size ; col ++)
            {
                int count = countCellsAround(row, col);


                if(isAlive(row, col))
                {
                    if(count == 2 || count == 3)
                    {
                        next[row][col] = true;
                    }
                    else
                    {
                        next[row][col] = false;
                    }
                }
                else
                {
                    if(count == 0)
                    {
                        next[row][col] = true;
                    }
                    else
                    {
                        next[row][col] = false;
                    }
                }
            }
        }

        boolean[][] temp;

        temp = board;
        board = next;
        next = temp;

        //wait(200);
        
    }

    public int countCellsAround(int row, int col)
    {
        int count = 0;

        
        for(int i = row -1; i <= row + 1; i++)
        {
            for(int j = col -1; j <= col + 1; j++)
            {
                if(!(i == row && j == col))
                {
                    if(isAlive(i, j))
                    {
                        count++;
                    }
                }
            }
        }
        
        


        return count;
    }

    public boolean isAlive(int row, int col)
    {
        if (row >= 0 && row < size && col >= 0 && col < size)
        {
            return board[row][col];
        }
        else 
        {
            return false;
        }
    }

    

    public void render()
    {
        pa.background(0);

        for(int row = 0 ; row < size ; row ++)
        {
            for(int col = 0 ; col < size ; col ++)
            {
                // x = cellSize * col;
                float x = PApplet.map(col, 0, size, 0, pa.width);

                // y = cellSize * row;
                float y = PApplet.map(row, 0, size, 0, pa.height);

                int count = countCellsAround(row, col);

                if(count == 0)
                {
                    colour = 0;
                }
                else if(count == 1)
                {
                    colour = 0;
                }
                else if(count == 2)
                {
                    colour = 0;
                }
                else if(count == 3)
                {
                    colour = 150;
                }
                else if(count == 4)
                {
                    colour = 150;
                }
                else
                {
                    colour = 100;
                }
                
                if (board[row][col])
                {
                    pa.fill(colour, 255, 255);
                }else{
                    
                    pa.noFill();
                }
                pa.rect(x, y, cellSize, cellSize);

            }
        }

    }
}
