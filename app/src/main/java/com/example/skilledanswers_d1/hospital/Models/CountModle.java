package com.example.skilledanswers_d1.hospital.Models;

/**
 * Created by Nishanth on 5/15/2016.
 */
public class CountModle {
    private int _count=0;

    public CountModle(int _count) {
        this._count = _count;
    }

    public CountModle() {
    }

    public int get_count() {
        return _count;
    }

    public void set_count(int _count) {
        this._count = _count;
    }
}
