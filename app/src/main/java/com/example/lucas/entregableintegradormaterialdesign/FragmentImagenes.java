package com.example.lucas.entregableintegradormaterialdesign;

;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Lucas on 6/1/16.
 */
public class FragmentImagenes extends Fragment {

    public static final String TITULO = "titulo";
    public static final String IMAGEN = "imagen";
    public static final String NUMERO_FRAGMENT = "numeroDeFragment";

    private int numeroDeFragment;

    public static FragmentImagenes dameUnFragment(int numeroDeFragment, int imagen, String titulo){
        FragmentImagenes fragmentFirst = new FragmentImagenes();
        Bundle args = new Bundle();
        args.putInt(NUMERO_FRAGMENT, numeroDeFragment);
        args.putInt(IMAGEN, imagen);
        args.putString(TITULO,titulo);
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View fragmentView = inflater.inflate(R.layout.fragment_blank,container, false);

        Bundle unBundle = getArguments();

        this.numeroDeFragment = unBundle.getInt(NUMERO_FRAGMENT);
        int unaImagen = unBundle.getInt(IMAGEN);
        String unTitulo = unBundle.getString(TITULO);

        ImageView unImageView = (ImageView) fragmentView.findViewById(R.id.fragmentBlankImageView);
        TextView unTextView= (TextView)fragmentView.findViewById(R.id.fragmentBlankTextView);

        unTextView.setText(unTitulo);
        unImageView.setImageResource(unaImagen);

        return fragmentView;

    }
}
