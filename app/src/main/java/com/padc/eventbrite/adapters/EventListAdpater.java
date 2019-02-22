package com.padc.eventbrite.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padc.eventbrite.R;
import com.padc.eventbrite.views.items.EventViewItem;

public class EventListAdpater extends RecyclerView.Adapter<EventViewItem> {


    @NonNull
    @Override
    public EventViewItem onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.view_item_event, viewGroup, false);
        return new EventViewItem(view);

    }

    @Override
    public void onBindViewHolder(@NonNull EventViewItem eventViewItem, int i) {

        if(i == 0){

            eventViewItem.tvEventTitle.setTextColor(eventViewItem.tvEventTitle
                    .getContext()
                    .getResources()
                    .getColor(R.color.white));

        }else{

            eventViewItem.tvEventTitle.setTextColor(eventViewItem.tvEventTitle
                    .getContext()
                    .getResources()
                    .getColor(R.color.colorTextSecondary));

        }


    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
