package entity;

/**
 * clasa Table contine un array de Cell-uri de 20x20
 */
public class Table {
    private Cell[][] table = new Cell[20][20];

    public Table() {
        this.table = new Cell[20][20];
    }

    public Cell[][] getTable() {
        return table;
    }

    public Cell getCell(int i, int j) {
        return table[i][j];
    }

    public void setTable(Cell[][] table) {
        this.table = table;
    }

    /**
     * functia calculeaza numarul vecinilor care traiesc
     * @param i coordonata pentru Cell-ul dorit
     * @param j coordonata pentru Cell-ul dorit
     * @return numarul vecinilor vii
     */
    private int nrNeighbours(int i, int j) {
        int sum = 0;

        if (i != 0 && j != 0){    //1
            if(getCell(i-1,j-1).isAlive()) {
                sum++;
            }
        }

        if (i != 0){
            if(getCell(i-1,j).isAlive()){
                sum++;
            }
        }

        if (i != 0 && j != 19){
            if(getCell(i-1,j+1).isAlive()){
                sum++;
            }
        }
        if (j != 0){
            if(getCell(i,j-1).isAlive()){
                sum++;
            }
        }

        if (j != 19){
            if(getCell(i,j+1).isAlive()){
                sum++;
            }
        }

        if (i != 19 && j != 0){
            if(getCell(i+1,j-1).isAlive()){
                sum++;
            }
        }

        if (i != 19){
            if(getCell(i+1, j).isAlive()){
                sum++;
            }
        }

        if (i != 19 && j != 19){
            if(getCell(i+1,j+1).isAlive()){
                sum++;
            }
        }
        return sum;
    }

    /**
     * parcurge array-ul si aplica algoritmul pentru joc
     */
    public void parseArray(){
        for (int i = 0; i < 20; i++)
            for (int j = 0; j < 20; j++)
            {
                int neighbours = this.nrNeighbours(i, j);
                if (neighbours < 2) {
                    table[i][j].setNewState(false);
                }
                else if (neighbours > 3) {
                    table[i][j].setNewState(false);
                }
                else if (neighbours == 3) {
                    table[i][j].setNewState(true);
                }
                else {
                    table[i][j].setNewState(table[i][j].getState());
                }
            }
    }

    /**
     * face update pentru starea fiecarui patratel
     */
    public void update() {
        for (int h=0; h < 20; h++){
            for (int w=0; w<20; w++){
                table[h][w].updateState();
            }
        }
    }
}
