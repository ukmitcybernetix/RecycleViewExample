package com.zendev.daftarorangterkaya;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListPeopleAdapter extends RecyclerView.Adapter<ListPeopleAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<People> listPeople;

    public ListPeopleAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<People> getListPeople() {
        return listPeople;
    }

    public void setListPeople(ArrayList<People> listPeople) {
        this.listPeople = listPeople;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_people, viewGroup, false);
        return new MyViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, final int position) {

        final People people = listPeople.get(position);

        myViewHolder.tvName.setText(getListPeople().get(position).getName());
        myViewHolder.tvFounder.setText(getListPeople().get(position).getFounder());

        Glide.with(context)
                .load(getListPeople().get(position).getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(myViewHolder.imgPhoto);

        myViewHolder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Kamu Memilih " + people.getName(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListPeople().size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvName;
        TextView tvFounder;
        ImageView imgPhoto;
        RelativeLayout parent;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            parent = itemView.findViewById(R.id.parent);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvFounder = itemView.findViewById(R.id.tv_item_founder);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
