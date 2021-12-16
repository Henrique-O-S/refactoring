package pt.up.fe.ldts.example5;

public class Turtle {
    private int row;
    private int column;
    private char direction;

    public Turtle(int row, int column, char direction) {
        this.row = row;
        this.column = column;
        this.direction = direction;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public char getDirection() {
        return direction;
    }

    public void setDirectionNorth(){
        direction = 'N';
    }

    public void setDirectionSouth(){
        direction = 'S';
    }

    public void setDirectionEast(){
        direction = 'E';
    }

    public void setDirectionWest(){
        direction = 'W';
    }

    public void executeNorth(char command){
        switch(command){
            case 'L':
                setDirectionWest();
                break;
            case 'R':
                setDirectionEast();
                break;
            case 'F':
                row--;
                break;
        }
    }

    public void executeSouth(char command){
        switch(command){
            case 'L':
                setDirectionEast();
                break;
            case 'R':
                setDirectionWest();
                break;
            case 'F':
                row++;
                break;
        }
    }

    public void executeWest(char command){
        switch(command){
            case 'L':
                setDirectionSouth();
                break;
            case 'R':
                setDirectionNorth();
                break;
            case 'F':
                column--;
                break;
        }
    }

    public void executeEast(char command){
        switch(command){
            case 'L':
                setDirectionNorth();
                break;
            case 'R':
                setDirectionSouth();
                break;
            case 'F':
                column++;
                break;
        }
    }

    public void execute(char command) {
        switch (direction){
            case 'N':
                executeNorth(command);
                break;
            case 'S':
                executeSouth(command);
                break;
            case 'W':
                executeWest(command);
                break;
            case 'E':
                executeEast(command);
                break;
        }
    }
}
