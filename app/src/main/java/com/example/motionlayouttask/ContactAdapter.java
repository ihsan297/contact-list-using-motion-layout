package com.example.motionlayouttask;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.RVViewHolder> {
    List<Contact> contacts;
    public ContactAdapter(List<Contact> ls){
        contacts=ls;
    }
    @NonNull
    @Override
    public ContactAdapter.RVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);

        return new RVViewHolder(row);

    }

    @Override
    public void onBindViewHolder(@NonNull ContactAdapter.RVViewHolder holder, int position) {
        holder.name.setText (contacts.get (position).getName ());
        holder.contact.setText (contacts.get (position).getContact ());

    }

    @Override
    public int getItemCount() {
        return contacts.size ();
    }

    public class RVViewHolder extends RecyclerView.ViewHolder {

        TextView name,contact;

        public RVViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById (R.id.name);
            contact=itemView.findViewById (R.id.phone);


        }
    }

}
