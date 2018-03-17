package modell;

import entity.Table;

/**
 * clasa Modell contine functiile principale folosite de butoane
 */
public class Modell {

    public Modell() {}

    /**
     * genereaza automat un model pentru joc
     * @param t arrayul pe care modificam
     */
    public void autoL(Table t) {
        t.getCell(2,6).setNewState(true);
        t.getCell(2,7).setNewState(true);
        t.getCell(2,8).setNewState(true);
        t.getCell(2,12).setNewState(true);
        t.getCell(2,13).setNewState(true);
        t.getCell(2,14).setNewState(true);

        t.getCell(4,4).setNewState(true);
        t.getCell(4,9).setNewState(true);
        t.getCell(4,11).setNewState(true);
        t.getCell(4,16).setNewState(true);

        t.getCell(5,4).setNewState(true);
        t.getCell(5,9).setNewState(true);
        t.getCell(5,11).setNewState(true);
        t.getCell(5,16).setNewState(true);

        t.getCell(6,4).setNewState(true);
        t.getCell(6,9).setNewState(true);
        t.getCell(6,11).setNewState(true);
        t.getCell(6,16).setNewState(true);

        t.getCell(7,6).setNewState(true);
        t.getCell(7,7).setNewState(true);
        t.getCell(7,8).setNewState(true);
        t.getCell(7,12).setNewState(true);
        t.getCell(7,13).setNewState(true);
        t.getCell(7,14).setNewState(true);

        t.getCell(9,6).setNewState(true);
        t.getCell(9,7).setNewState(true);
        t.getCell(9,8).setNewState(true);
        t.getCell(9,12).setNewState(true);
        t.getCell(9,13).setNewState(true);
        t.getCell(9,14).setNewState(true);

        t.getCell(10,4).setNewState(true);
        t.getCell(10,9).setNewState(true);
        t.getCell(10,11).setNewState(true);
        t.getCell(10,16).setNewState(true);

        t.getCell(11,4).setNewState(true);
        t.getCell(11,9).setNewState(true);
        t.getCell(11,11).setNewState(true);
        t.getCell(11,16).setNewState(true);

        t.getCell(12,4).setNewState(true);
        t.getCell(12,9).setNewState(true);
        t.getCell(12,11).setNewState(true);
        t.getCell(12,16).setNewState(true);

        t.getCell(14,6).setNewState(true);
        t.getCell(14,7).setNewState(true);
        t.getCell(14,8).setNewState(true);
        t.getCell(14,12).setNewState(true);
        t.getCell(14,13).setNewState(true);
        t.getCell(14,14).setNewState(true);
    }

    /**
     * functia sterge toate Cell-urile vii
     * @param t array-ul initial pe care vrem sa stergem
     */
    public void clear(Table t) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (t.getCell(i, j).isAlive()) {
                    t.getCell(i, j).changeState();
                    t.getCell(i, j).updateState();
                }
            }
        }
    }
}
