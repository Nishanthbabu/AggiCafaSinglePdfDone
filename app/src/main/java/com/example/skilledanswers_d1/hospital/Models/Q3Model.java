package com.example.skilledanswers_d1.hospital.Models;

/**
 * Created by SkilledAnswers-D1 on 14-05-2016.
 */
public class Q3Model {
    private int _key=0;
    private int _always=0;
    private int _usualy=0;
    private int _sometimes=0;
    private int _never=0;

    public Q3Model(int _key, int _always, int _usualy, int _sometimes, int _never) {
        this._key = _key;
        this._always = _always;
        this._usualy = _usualy;
        this._sometimes = _sometimes;
        this._never = _never;
    }

    public Q3Model() {
    }

    public int get_key() {
        return _key;
    }

    public void set_key(int _key) {
        this._key = _key;
    }

    public int get_always() {
        return _always;
    }

    public void set_always(int _always) {
        this._always = _always;
    }

    public int get_usualy() {
        return _usualy;
    }

    public void set_usualy(int _usualy) {
        this._usualy = _usualy;
    }

    public int get_sometimes() {
        return _sometimes;
    }

    public void set_sometimes(int _sometimes) {
        this._sometimes = _sometimes;
    }

    public int get_never() {
        return _never;
    }

    public void set_never(int _never) {
        this._never = _never;
    }
}
