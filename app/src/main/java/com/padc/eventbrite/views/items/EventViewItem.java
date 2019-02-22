package com.padc.eventbrite.views.items;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.padc.eventbrite.R;

public class EventViewItem extends RecyclerView.ViewHolder {

    public TextView tvEventTitle;

    public EventViewItem(@NonNull View itemView) {
        super(itemView);

        tvEventTitle = itemView.findViewById(R.id.tv_event_title);
    }
}
