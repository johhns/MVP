package com.example.mvp.Adaptadores;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.mvp.Vista.Fragmentos.FragmentoEmpleados;
import com.example.mvp.Vista.Fragmentos.FragmentoEquipos;
import com.example.mvp.Vista.Fragmentos.FragmentoProductos;

import java.util.ArrayList;

public class AdaptadorViewPager2 extends FragmentStateAdapter {

    private ArrayList<Fragment> fragmentos = new ArrayList<>() ;



    public AdaptadorViewPager2(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
        fragmentos.add( new FragmentoEmpleados() ) ;
        fragmentos.add( new FragmentoEquipos() ) ;
        fragmentos.add( new FragmentoProductos() ) ;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragmentos.get(position) ;
    }


    @Override
    public int getItemCount() {
        return fragmentos.size();
    }
}

