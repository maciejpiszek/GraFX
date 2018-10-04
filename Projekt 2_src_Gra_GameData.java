package Gra;

public class GameData {

    private int total = 10;
    private int pjongJangIncome = 0;
    private int krasnojarskIncome = 0;
    private int stillwaterIncome = 0;

    public GameData() {

    }

    public void buyTen() {

        if (total >= 10) {
            total -= 10;
        }
    }

    public void buyThirty() {

        if (total >= 30) {
            total -= 30;
        }
    }

    public void byuMine() {

        if (total >= 100) {
            total -= 100;
        }
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total += total;
    }


    public int getPjongJangIncome() {
        return pjongJangIncome;
    }

    public void setPjongJangIncome(int pjongJangIncome) {
        this.pjongJangIncome += pjongJangIncome;
    }

    public int getKrasnojarskIncome() {
        return krasnojarskIncome;
    }

    public void setKrasnojarskIncome(int krasnojarskIncome) {
        this.krasnojarskIncome += krasnojarskIncome;
    }

    public int getStillwaterIncome() {
        return stillwaterIncome;
    }

    public void setStillwaterIncome(int stillwaterIncome) {
        this.stillwaterIncome += stillwaterIncome;
    }
}