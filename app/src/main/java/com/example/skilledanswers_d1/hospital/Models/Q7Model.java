package com.example.skilledanswers_d1.hospital.Models;

/**
 * Created by SkilledAnswers-D1 on 14-05-2016.
 */
public class Q7Model {
    private int _key=0;
    private int _excellent=0;
    private int _veryGood=0;
    private int _good=0;
    private int _average=0;
    private int _poor=0;

    public Q7Model(int _key, int _excellent, int _veryGood, int _good, int _average, int _poor) {
        this._key = _key;
        this._excellent = _excellent;
        this._veryGood = _veryGood;
        this._good = _good;
        this._average = _average;
        this._poor = _poor;
    }

    public Q7Model() {
    }

    public int get_key() {
        return _key;
    }

    public void set_key(int _key) {
        this._key = _key;
    }

    public int get_excellent() {
        return _excellent;
    }

    public void set_excellent(int _excellent) {
        this._excellent = _excellent;
    }

    public int get_veryGood() {
        return _veryGood;
    }

    public void set_veryGood(int _veryGood) {
        this._veryGood = _veryGood;
    }

    public int get_good() {
        return _good;
    }

    public void set_good(int _good) {
        this._good = _good;
    }

    public int get_average() {
        return _average;
    }

    public void set_average(int _average) {
        this._average = _average;
    }

    public int get_poor() {
        return _poor;
    }

    public void set_poor(int _poor) {
        this._poor = _poor;
    }
}
