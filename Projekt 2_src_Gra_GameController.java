package Gra;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import javafx.util.Duration;

public class GameController {


    private GameData gameData = new GameData();
    @FXML
    private TextField totalIncomeK;
    @FXML
    private TextField totalIncomeS;
    @FXML
    private TextField totalIncomeP;

    @FXML
    private TextField totalK;
    @FXML
    private TextField totalS;
    @FXML
    private TextField totalP;


    //



    @FXML
    private GridPane pGrid1, pGrid2, pGrid3;


    private Integer p0value = 0, p1value = 0, p2value = 0, p3value = 0;

    @FXML
    private TextField p0, p1, p2, p3;

    @FXML
    private Button pbuy1, pbuy2, pbuy3, pbuy4;

    @FXML
    private Label pLabel10, pLabel11, pLabel12, pLabel13, pLabel20, pLabel21, pLabel22, pLabel23, pLabel30, pLabel31, pLabel32, pLabel33, pLabel40, pLabel41, pLabel42, pLabel43;

    @FXML
    private ToggleButton p00, p01, p02, p03, p04, p05, p10, p11, p12, p13, p14, p15, p20, p21, p22, p23, p24, p25, p30, p31, p32, p33, p34, p35;


    //


    @FXML
    private GridPane kGrid1, kGrid2, kGrid3;

    private Integer k0value = 0, k1value = 0, k2value = 0, k3value = 0;

    @FXML
    private TextField k0, k1, k2, k3;

    @FXML
    private Button kbuy1, kbuy2, kbuy3, kbuy4;

    @FXML
    private Label kLabel10, kLabel11, kLabel12, kLabel13, kLabel20, kLabel21, kLabel22, kLabel23, kLabel30, kLabel31, kLabel32, kLabel33, kLabel40, kLabel41, kLabel42, kLabel43;

    @FXML
    private ToggleButton k00, k01, k02, k03, k04, k05, k10, k11, k12, k13, k14, k15, k20, k21, k22, k23, k24, k25, k30, k31, k32, k33, k34, k35;


    //


    @FXML
    private GridPane sGrid1, sGrid2, sGrid3;

    private Integer s0value = 0, s1value = 0, s2value = 0, s3value = 0;

    @FXML
    private TextField s0, s1, s2, s3;

    @FXML
    private Button sbuy1, sbuy2, sbuy3, sbuy4;

    @FXML
    private Label sLabel10, sLabel11, sLabel12, sLabel13, sLabel20, sLabel21, sLabel22, sLabel23, sLabel30, sLabel31, sLabel32, sLabel33, sLabel40, sLabel41, sLabel42, sLabel43;

    @FXML
    private ToggleButton s00, s01, s02, s03, s04, s05, s10, s11, s12, s13, s14, s15, s20, s21, s22, s23, s24, s25, s30, s31, s32, s33, s34, s35;

    //

    private Object actionSource;


    public GameController() {

    }



    public void initialize() {

        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), evt -> {
            gameData.setTotal(gameData.getPjongJangIncome() + gameData.getKrasnojarskIncome() + gameData.getStillwaterIncome());
            setValue(gameData.getTotal());
        }));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }



    private void toggleButtonsPjongJang() {

        if (actionSource == p00) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                p00.setDisable(true);
                p00.setText("1♦/s");
                setValue(gameData.getTotal());
                p0value+=1;
                gameData.setPjongJangIncome(1);
                p0.setText(p0value.toString() + " ♦ / s");
            }
        }
        if (actionSource == p01) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                p01.setDisable(true);
                p01.setText("1♦/s");
                setValue(gameData.getTotal());
                p0value+=1;
                gameData.setPjongJangIncome(1);
                p0.setText(p0value.toString() + " ♦ / s");
            }
        }
        if (actionSource == p02) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                p02.setDisable(true);
                p02.setText("1♦/s");
                setValue(gameData.getTotal());
                p0value+=1;
                gameData.setPjongJangIncome(1);
                p0.setText(p0value.toString() + " ♦ / s");

            }
        }
        if (actionSource == p03) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                p03.setDisable(true);
                p03.setText("1♦/s");
                setValue(gameData.getTotal());
                p0value+=1;
                gameData.setPjongJangIncome(1);
                p0.setText(p0value.toString() + " ♦ / s");
            }
        }
        if (actionSource == p04) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                p04.setDisable(true);
                p04.setText("1♦/s");
                setValue(gameData.getTotal());
                p0value+=1;
                gameData.setPjongJangIncome(1);
                p0.setText(p0value.toString() + " ♦ / s");
            }
        }
        if (actionSource == p05) {
            if (gameData.getTotal()>=30) {
                gameData.buyThirty();
                p05.setDisable(true);
                p05.setText("2♦/s");
                setValue(gameData.getTotal());
                p0value+=2;
                gameData.setPjongJangIncome(2);
                p0.setText(p0value.toString() + " ♦ / s");
            }
        }
        if (actionSource == pbuy1) {
            if (gameData.getTotal()>=100) {
                gameData.byuMine();
                setValue(gameData.getTotal());
                pLabel10.setVisible(false);
                pLabel11.setVisible(false);
                pLabel12.setVisible(false);
                pLabel13.setVisible(false);
                pbuy1.setVisible(false);
                p1.setVisible(true);
                p10.setVisible(true);
                p11.setVisible(true);
                p12.setVisible(true);
                p13.setVisible(true);
                p14.setVisible(true);
                p15.setVisible(true);
                pGrid1.setGridLinesVisible(true);
                pbuy2.setVisible(true);
                pLabel20.setVisible(true);
                pLabel21.setVisible(true);
                pLabel22.setVisible(true);
                pLabel23.setVisible(true);
            }
        }
        if (actionSource == p10) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                p10.setDisable(true);
                p10.setText("1♦/s");
                setValue(gameData.getTotal());
                p1value+=1;
                gameData.setPjongJangIncome(1);
                p1.setText(p1value.toString() + " ♦ / s");
            }
        }
        if (actionSource == p11) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                p11.setDisable(true);
                p11.setText("1♦/s");
                setValue(gameData.getTotal());
                p1value+=1;
                gameData.setPjongJangIncome(1);
                p1.setText(p1value.toString() + " ♦ / s");
            }
        }
        if (actionSource == p12) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                p12.setDisable(true);
                p12.setText("1♦/s");
                setValue(gameData.getTotal());
                p1value+=1;
                gameData.setPjongJangIncome(1);
                p1.setText(p1value.toString() + " ♦ / s");

            }
        }
        if (actionSource == p13) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                p13.setDisable(true);
                p13.setText("1♦/s");
                setValue(gameData.getTotal());
                p1value+=1;
                gameData.setPjongJangIncome(1);
                p1.setText(p1value.toString() + " ♦ / s");
            }
        }
        if (actionSource == p14) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                p14.setDisable(true);
                p14.setText("1♦/s");
                setValue(gameData.getTotal());
                p1value+=1;
                gameData.setPjongJangIncome(1);
                p1.setText(p1value.toString() + " ♦ / s");
            }
        }
        if (actionSource == p15) {
            if (gameData.getTotal()>=30) {
                gameData.buyThirty();
                p15.setDisable(true);
                p15.setText("2♦/s");
                setValue(gameData.getTotal());
                p1value+=2;
                gameData.setPjongJangIncome(2);
                p1.setText(p1value.toString() + " ♦ / s");
            }
        }
        if (actionSource == pbuy2) {
            if (gameData.getTotal()>=100) {
                gameData.byuMine();
                setValue(gameData.getTotal());
                pLabel20.setVisible(false);
                pLabel21.setVisible(false);
                pLabel22.setVisible(false);
                pLabel23.setVisible(false);
                pbuy2.setVisible(false);
                p2.setVisible(true);
                p20.setVisible(true);
                p21.setVisible(true);
                p22.setVisible(true);
                p23.setVisible(true);
                p24.setVisible(true);
                p25.setVisible(true);
                pGrid2.setGridLinesVisible(true);
                pbuy3.setVisible(true);
                pLabel30.setVisible(true);
                pLabel31.setVisible(true);
                pLabel32.setVisible(true);
                pLabel33.setVisible(true);
            }
        }
        if (actionSource == p20) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                p20.setDisable(true);
                p20.setText("1♦/s");
                setValue(gameData.getTotal());
                p2value+=1;
                gameData.setPjongJangIncome(1);
                p2.setText(p2value.toString() + " ♦ / s");
            }
        }
        if (actionSource == p21) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                p21.setDisable(true);
                p21.setText("1♦/s");
                setValue(gameData.getTotal());
                p2value+=1;
                gameData.setPjongJangIncome(1);
                p2.setText(p2value.toString() + " ♦ / s");
            }
        }
        if (actionSource == p22) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                p22.setDisable(true);
                p22.setText("1♦/s");
                setValue(gameData.getTotal());
                p2value+=1;
                gameData.setPjongJangIncome(1);
                p2.setText(p2value.toString() + " ♦ / s");

            }
        }
        if (actionSource == p23) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                p23.setDisable(true);
                p23.setText("1♦/s");
                setValue(gameData.getTotal());
                p2value+=1;
                gameData.setPjongJangIncome(1);
                p2.setText(p2value.toString() + " ♦ / s");
            }
        }
        if (actionSource == p24) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                p24.setDisable(true);
                p24.setText("1♦/s");
                setValue(gameData.getTotal());
                p2value+=1;
                gameData.setPjongJangIncome(1);
                p2.setText(p2value.toString() + " ♦ / s");
            }
        }
        if (actionSource == p25) {
            if (gameData.getTotal()>=30) {
                gameData.buyThirty();
                p25.setDisable(true);
                p25.setText("2♦/s");
                setValue(gameData.getTotal());
                p2value+=2;
                gameData.setPjongJangIncome(2);
                p2.setText(p2value.toString() + " ♦ / s");
            }
        }
        if (actionSource == pbuy3) {
            if (gameData.getTotal()>= 100) {
                gameData.byuMine();
                setValue(gameData.getTotal());
                pLabel30.setVisible(false);
                pLabel31.setVisible(false);
                pLabel32.setVisible(false);
                pLabel33.setVisible(false);
                pbuy3.setVisible(false);
                /*
                p3.setVisible(true);
                p30.setVisible(true);
                p31.setVisible(true);
                p32.setVisible(true);
                p33.setVisible(true);
                p34.setVisible(true);
                p35.setVisible(true);
                pGrid3.setGridLinesVisible(true);
                pbuy4.setVisible(true);
                pLabel40.setVisible(true);
                pLabel41.setVisible(true);
                pLabel42.setVisible(true);
                pLabel43.setVisible(true);
                */
            }
        }
    }

    private void toggleButtonsKrasnojarsk() {

        if (actionSource == k00) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                k00.setDisable(true);
                k00.setText("1♦/s");
                setValue(gameData.getTotal());
                k0value+=1;
                gameData.setKrasnojarskIncome(1);
                k0.setText(k0value.toString() + " ♦ / s");
            }
        }
        if (actionSource == k01) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                k01.setDisable(true);
                k01.setText("1♦/s");
                setValue(gameData.getTotal());
                k0value+=1;
                gameData.setKrasnojarskIncome(1);
                k0.setText(k0value.toString() + " ♦ / s");
            }
        }
        if (actionSource == k02) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                k02.setDisable(true);
                k02.setText("1♦/s");
                setValue(gameData.getTotal());
                k0value+=1;
                gameData.setKrasnojarskIncome(1);
                k0.setText(k0value.toString() + " ♦ / s");

            }
        }
        if (actionSource == k03) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                k03.setDisable(true);
                k03.setText("1♦/s");
                setValue(gameData.getTotal());
                k0value+=1;
                gameData.setKrasnojarskIncome(1);
                k0.setText(k0value.toString() + " ♦ / s");
            }
        }
        if (actionSource == k04) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                k04.setDisable(true);
                k04.setText("1♦/s");
                setValue(gameData.getTotal());
                k0value+=1;
                gameData.setKrasnojarskIncome(1);
                k0.setText(k0value.toString() + " ♦ / s");
            }
        }
        if (actionSource == k05) {
            if (gameData.getTotal()>=30) {
                gameData.buyThirty();
                k05.setDisable(true);
                k05.setText("2♦/s");
                setValue(gameData.getTotal());
                k0value+=2;
                gameData.setKrasnojarskIncome(2);
                k0.setText(k0value.toString() + " ♦ / s");
            }
        }
        if (actionSource == kbuy1) {
            if (gameData.getTotal()>=100) {
                gameData.byuMine();
                setValue(gameData.getTotal());
                kLabel10.setVisible(false);
                kLabel11.setVisible(false);
                kLabel12.setVisible(false);
                kLabel13.setVisible(false);
                kbuy1.setVisible(false);
                k1.setVisible(true);
                k10.setVisible(true);
                k11.setVisible(true);
                k12.setVisible(true);
                k13.setVisible(true);
                k14.setVisible(true);
                k15.setVisible(true);
                kGrid1.setGridLinesVisible(true);
                kbuy2.setVisible(true);
                kLabel20.setVisible(true);
                kLabel21.setVisible(true);
                kLabel22.setVisible(true);
                kLabel23.setVisible(true);
            }
        }
        if (actionSource == k10) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                k10.setDisable(true);
                k10.setText("1♦/s");
                setValue(gameData.getTotal());
                k1value+=1;
                gameData.setKrasnojarskIncome(1);
                k1.setText(k1value.toString() + " ♦ / s");
            }
        }
        if (actionSource == k11) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                k11.setDisable(true);
                k11.setText("1♦/s");
                setValue(gameData.getTotal());
                k1value+=1;
                gameData.setKrasnojarskIncome(1);
                k1.setText(k1value.toString() + " ♦ / s");
            }
        }
        if (actionSource == k12) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                k12.setDisable(true);
                k12.setText("1♦/s");
                setValue(gameData.getTotal());
                k1value+=1;
                gameData.setKrasnojarskIncome(1);
                k1.setText(k1value.toString() + " ♦ / s");

            }
        }
        if (actionSource == k13) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                k13.setDisable(true);
                k13.setText("1♦/s");
                setValue(gameData.getTotal());
                k1value+=1;
                gameData.setKrasnojarskIncome(1);
                k1.setText(k1value.toString() + " ♦ / s");
            }
        }
        if (actionSource == k14) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                k14.setDisable(true);
                k14.setText("1♦/s");
                setValue(gameData.getTotal());
                k1value+=1;
                gameData.setKrasnojarskIncome(1);
                k1.setText(k1value.toString() + " ♦ / s");
            }
        }
        if (actionSource == k15) {
            if (gameData.getTotal()>=30) {
                gameData.buyThirty();
                k15.setDisable(true);
                k15.setText("2♦/s");
                setValue(gameData.getTotal());
                k1value+=2;
                gameData.setKrasnojarskIncome(2);
                k1.setText(k1value.toString() + " ♦ / s");
            }
        }
        if (actionSource == kbuy2) {
            if (gameData.getTotal()>= 100) {
                gameData.byuMine();
                setValue(gameData.getTotal());
                kLabel20.setVisible(false);
                kLabel21.setVisible(false);
                kLabel22.setVisible(false);
                kLabel23.setVisible(false);
                kbuy2.setVisible(false);
                k2.setVisible(true);
                k20.setVisible(true);
                k21.setVisible(true);
                k22.setVisible(true);
                k23.setVisible(true);
                k24.setVisible(true);
                k25.setVisible(true);
                kGrid2.setGridLinesVisible(true);
                kbuy3.setVisible(true);
                kLabel30.setVisible(true);
                kLabel31.setVisible(true);
                kLabel32.setVisible(true);
                kLabel33.setVisible(true);
            }
        }
        if (actionSource == k20) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                k20.setDisable(true);
                k20.setText("1♦/s");
                setValue(gameData.getTotal());
                k2value+=1;
                gameData.setKrasnojarskIncome(1);
                k2.setText(p2value.toString() + " ♦ / s");
            }
        }
        if (actionSource == k21) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                k21.setDisable(true);
                k21.setText("1♦/s");
                setValue(gameData.getTotal());
                k2value+=1;
                gameData.setKrasnojarskIncome(1);
                k2.setText(k2value.toString() + " ♦ / s");
            }
        }
        if (actionSource == k22) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                k22.setDisable(true);
                k22.setText("1♦/s");
                setValue(gameData.getTotal());
                k2value+=1;
                gameData.setKrasnojarskIncome(1);
                k2.setText(k2value.toString() + " ♦ / s");

            }
        }
        if (actionSource == k23) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                k23.setDisable(true);
                k23.setText("1♦/s");
                setValue(gameData.getTotal());
                k2value+=1;
                gameData.setKrasnojarskIncome(1);
                k2.setText(k2value.toString() + " ♦ / s");
            }
        }
        if (actionSource == k24) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                k24.setDisable(true);
                k24.setText("1♦/s");
                setValue(gameData.getTotal());
                k2value+=1;
                gameData.setKrasnojarskIncome(1);
                k2.setText(k2value.toString() + " ♦ / s");
            }
        }
        if (actionSource == k25) {
            if (gameData.getTotal()>=30) {
                gameData.buyThirty();
                k25.setDisable(true);
                k25.setText("2♦/s");
                setValue(gameData.getTotal());
                k2value+=2;
                gameData.setKrasnojarskIncome(2);
                k2.setText(k2value.toString() + " ♦ / s");
            }
        }
        if (actionSource == kbuy3) {
            if (gameData.getTotal()>= 100) {
                gameData.byuMine();
                setValue(gameData.getTotal());
                kLabel30.setVisible(false);
                kLabel31.setVisible(false);
                kLabel32.setVisible(false);
                kLabel33.setVisible(false);
                kbuy3.setVisible(false);
                /*
                k3.setVisible(true);
                k30.setVisible(true);
                k31.setVisible(true);
                k32.setVisible(true);
                k33.setVisible(true);
                k34.setVisible(true);
                k35.setVisible(true);
                kGrid3.setGridLinesVisible(true);
                kbuy4.setVisible(true);
                kLabel40.setVisible(true);
                kLabel41.setVisible(true);
                kLabel42.setVisible(true);
                kLabel43.setVisible(true);
                */
            }
        }
    }

    private void toggleButtonsStillwater() {

        if (actionSource == s00) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                s00.setDisable(true);
                s00.setText("1♦/s");
                setValue(gameData.getTotal());
                s0value+=1;
                gameData.setStillwaterIncome(1);
                s0.setText(s0value.toString() + " ♦ / s");
            }
        }
        if (actionSource == s01) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                s01.setDisable(true);
                s01.setText("1♦/s");
                setValue(gameData.getTotal());
                s0value+=1;
                gameData.setStillwaterIncome(1);
                s0.setText(s0value.toString() + " ♦ / s");
            }
        }
        if (actionSource == s02) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                s02.setDisable(true);
                s02.setText("1♦/s");
                setValue(gameData.getTotal());
                s0value+=1;
                gameData.setStillwaterIncome(1);
                s0.setText(s0value.toString() + " ♦ / s");

            }
        }
        if (actionSource == s03) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                s03.setDisable(true);
                s03.setText("1♦/s");
                setValue(gameData.getTotal());
                s0value+=1;
                gameData.setStillwaterIncome(1);
                s0.setText(s0value.toString() + " ♦ / s");
            }
        }
        if (actionSource == s04) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                s04.setDisable(true);
                s04.setText("1♦/s");
                setValue(gameData.getTotal());
                s0value+=1;
                gameData.setStillwaterIncome(1);
                s0.setText(s0value.toString() + " ♦ / s");
            }
        }
        if (actionSource == s05) {
            if (gameData.getTotal()>=30) {
                gameData.buyThirty();
                s05.setDisable(true);
                s05.setText("2♦/s");
                setValue(gameData.getTotal());
                s0value+=2;
                gameData.setStillwaterIncome(2);
                s0.setText(s0value.toString() + " ♦ / s");
            }
        }
        if (actionSource == sbuy1) {
            if (gameData.getTotal()>=100) {
                gameData.byuMine();
                setValue(gameData.getTotal());
                sLabel10.setVisible(false);
                sLabel11.setVisible(false);
                sLabel12.setVisible(false);
                sLabel13.setVisible(false);
                sbuy1.setVisible(false);
                s1.setVisible(true);
                s10.setVisible(true);
                s11.setVisible(true);
                s12.setVisible(true);
                s13.setVisible(true);
                s14.setVisible(true);
                s15.setVisible(true);
                sGrid1.setGridLinesVisible(true);
                sbuy2.setVisible(true);
                sLabel20.setVisible(true);
                sLabel21.setVisible(true);
                sLabel22.setVisible(true);
                sLabel23.setVisible(true);
            }
        }
        if (actionSource == s10) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                s10.setDisable(true);
                s10.setText("1♦/s");
                setValue(gameData.getTotal());
                s1value+=1;
                gameData.setStillwaterIncome(1);
                s1.setText(s1value.toString() + " ♦ / s");
            }
        }
        if (actionSource == s11) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                s11.setDisable(true);
                s11.setText("1♦/s");
                setValue(gameData.getTotal());
                s1value+=1;
                gameData.setStillwaterIncome(1);
                s1.setText(s1value.toString() + " ♦ / s");
            }
        }
        if (actionSource == s12) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                s12.setDisable(true);
                s12.setText("1♦/s");
                setValue(gameData.getTotal());
                s1value+=1;
                gameData.setStillwaterIncome(1);
                s1.setText(s1value.toString() + " ♦ / s");

            }
        }
        if (actionSource == s13) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                s13.setDisable(true);
                s13.setText("1♦/s");
                setValue(gameData.getTotal());
                s1value+=1;
                gameData.setStillwaterIncome(1);
                s1.setText(s1value.toString() + " ♦ / s");
            }
        }
        if (actionSource == s14) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                s14.setDisable(true);
                s14.setText("1♦/s");
                setValue(gameData.getTotal());
                s1value+=1;
                gameData.setStillwaterIncome(1);
                s1.setText(s1value.toString() + " ♦ / s");
            }
        }
        if (actionSource == s15) {
            if (gameData.getTotal()>=30) {
                gameData.buyThirty();
                s15.setDisable(true);
                s15.setText("2♦/s");
                setValue(gameData.getTotal());
                s1value+=2;
                gameData.setStillwaterIncome(2);
                s1.setText(k1value.toString() + " ♦ / s");
            }
        }
        if (actionSource == sbuy2) {
            if (gameData.getTotal()>= 100) {
                gameData.byuMine();
                setValue(gameData.getTotal());
                sLabel20.setVisible(false);
                sLabel21.setVisible(false);
                sLabel22.setVisible(false);
                sLabel23.setVisible(false);
                sbuy2.setVisible(false);
                s2.setVisible(true);
                s20.setVisible(true);
                s21.setVisible(true);
                s22.setVisible(true);
                s23.setVisible(true);
                s24.setVisible(true);
                s25.setVisible(true);
                sGrid2.setGridLinesVisible(true);
                sbuy3.setVisible(true);
                sLabel30.setVisible(true);
                sLabel31.setVisible(true);
                sLabel32.setVisible(true);
                sLabel33.setVisible(true);
            }
        }
        if (actionSource == s20) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                s20.setDisable(true);
                s20.setText("1♦/s");
                setValue(gameData.getTotal());
                s2value+=1;
                gameData.setStillwaterIncome(1);
                s2.setText(s2value.toString() + " ♦ / s");
            }
        }
        if (actionSource == s21) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                s21.setDisable(true);
                s21.setText("1♦/s");
                setValue(gameData.getTotal());
                s2value+=1;
                gameData.setStillwaterIncome(1);
                s2.setText(s2value.toString() + " ♦ / s");
            }
        }
        if (actionSource == s22) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                s22.setDisable(true);
                s22.setText("1♦/s");
                setValue(gameData.getTotal());
                s2value+=1;
                gameData.setStillwaterIncome(1);
                s2.setText(s2value.toString() + " ♦ / s");

            }
        }
        if (actionSource == s23) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                s23.setDisable(true);
                s23.setText("1♦/s");
                setValue(gameData.getTotal());
                s2value+=1;
                gameData.setStillwaterIncome(1);
                s2.setText(s2value.toString() + " ♦ / s");
            }
        }
        if (actionSource == s24) {
            if (gameData.getTotal()>=10) {
                gameData.buyTen();
                s24.setDisable(true);
                s24.setText("1♦/s");
                setValue(gameData.getTotal());
                s2value+=1;
                gameData.setStillwaterIncome(1);
                s2.setText(s2value.toString() + " ♦ / s");
            }
        }
        if (actionSource == s25) {
            if (gameData.getTotal()>=30) {
                gameData.buyThirty();
                s25.setDisable(true);
                s25.setText("2♦/s");
                setValue(gameData.getTotal());
                s2value+=2;
                gameData.setStillwaterIncome(2);
                s2.setText(s2value.toString() + " ♦ / s");
            }
        }
        if (actionSource == sbuy3) {
            if (gameData.getTotal()>= 100) {
                gameData.byuMine();
                setValue(gameData.getTotal());
                sLabel30.setVisible(false);
                sLabel31.setVisible(false);
                sLabel32.setVisible(false);
                sLabel33.setVisible(false);
                sbuy3.setVisible(false);

                /*
                s3.setVisible(true);
                s30.setVisible(true);
                s31.setVisible(true);
                s32.setVisible(true);
                s33.setVisible(true);
                s34.setVisible(true);
                s35.setVisible(true);
                sGrid3.setGridLinesVisible(true);
                sbuy4.setVisible(true);
                sLabel40.setVisible(true);
                sLabel41.setVisible(true);
                sLabel42.setVisible(true);
                sLabel43.setVisible(true);
                */
            }
        }
    }

    public void setSelectedPjongJang (ActionEvent event) {

        actionSource = event.getSource();
        toggleButtonsPjongJang();
        setIncome(gameData.getPjongJangIncome() + gameData.getKrasnojarskIncome() + gameData.getStillwaterIncome());
    }

    public void setSelectedKrasnojarsk (ActionEvent event) {

        actionSource = event.getSource();
        toggleButtonsKrasnojarsk();
        setIncome(gameData.getPjongJangIncome() + gameData.getKrasnojarskIncome() + gameData.getStillwaterIncome());
    }

    public void setSelectedStillwater (ActionEvent event) {

        actionSource = event.getSource();
        toggleButtonsStillwater();
        setIncome(gameData.getPjongJangIncome() + gameData.getKrasnojarskIncome() + gameData.getStillwaterIncome());
    }

    private void setValue (Integer total) {

        totalP.setText(total.toString());
        totalK.setText(total.toString());
        totalS.setText(total.toString());
    }

    private void setIncome (Integer income) {

        totalIncomeP.setText(income.toString() + " ♦ / s");
        totalIncomeK.setText(income.toString() + " ♦ / s");
        totalIncomeS.setText(income.toString() + " ♦ / s");
    }
}