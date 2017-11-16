package com.salazar.munidenuncias.repository;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.salazar.munidenuncias.R;
import com.salazar.munidenuncias.Service.ApiService;
import com.salazar.munidenuncias.model.Denuncia;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;


public class DenunciasAdapter extends RecyclerView.Adapter<DenunciasAdapter.ViewHolder> {

    private static final String TAG = DenunciasAdapter.class.getSimpleName();

    private List<Denuncia> denuncia;
    private Activity activity;


    public DenunciasAdapter(Activity activity){
        this.denuncia = new ArrayList<>();
        this.activity = activity;

    }

    public void setDenuncia(List<Denuncia> denuncia){
        this.denuncia = denuncia;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView fotoImage;
        public TextView titulo;
        public TextView user;
        public TextView ubicacion;


        public ViewHolder(View itemView) {
            super(itemView);
            fotoImage = (ImageView) itemView.findViewById(R.id.foto_image);
            titulo = (TextView) itemView.findViewById(R.id.titulo_text);
           // user = (TextView) itemView.findViewById(R.id.user_text);
            ubicacion = (TextView) itemView.findViewById(R.id.descripcion);


        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_denuncia, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(DenunciasAdapter.ViewHolder holder, int position) {

        Denuncia denuncia = this.denuncia.get(position);

        float lat = denuncia.getLat();
        float lng = denuncia.getLng();
        holder.titulo.setText(denuncia.getTitulo());
        //holder.user.setText(denuncia.getUsuario());
        holder.ubicacion.setText(denuncia.getDescripcion());

        String url = ApiService.API_BASE_URL + "/images/" + denuncia.getFoto();

        Picasso.with(holder.itemView.getContext()).load(url).into(holder.fotoImage);

    }


    @Override
    public int getItemCount() {
        return this.denuncia.size();
    }

}