package com.example.lucas.entregableintegradormaterialdesign;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lucas on 6/1/16.
 */
public class MiFragmentPageAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> listadoDeFragments;


    public MiFragmentPageAdapter(FragmentManager fm) {
        super(fm);

        this.listadoDeFragments = new ArrayList<>();

        this.listadoDeFragments.add(FragmentImagenes.dameUnFragment(0,R.drawable.cancha_noticia, "Cancha Noticia"));
        this.listadoDeFragments.add(FragmentImagenes.dameUnFragment(1,R.drawable.copa_noticia, "Copa Noticia"));
        this.listadoDeFragments.add(FragmentImagenes.dameUnFragment(2,R.drawable.estadio_noticia, "Estado Noticia"));
        this.listadoDeFragments.add(FragmentImagenes.dameUnFragment(3,R.drawable.kun_noticia, "Kun Noticia"));
        this.listadoDeFragments.add(FragmentImagenes.dameUnFragment(4,R.drawable.messi_noticia, "Messi Noticia"));
    }



    @Override
    public int getCount() {
        return listadoDeFragments.size();
    }


    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        return this.listadoDeFragments.get(position);
    }
}
