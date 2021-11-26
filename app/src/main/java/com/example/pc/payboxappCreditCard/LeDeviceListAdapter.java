package com.example.pc.payboxappCreditCard;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class LeDeviceListAdapter extends ArrayAdapter<BluetoothDevice> {


    String address;


    public LeDeviceListAdapter(Context context, ArrayList<BluetoothDevice> devices) {
        super(context, 0, devices);
    }

    @NonNull
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        // General ListView optimization code.
        BluetoothDevice device = getItem(position);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.ble_item, parent, false);
        }
        TextView devName = view.findViewById(R.id.device_name) ;
        address = device.getAddress();
        devName.setText(device.getName());
        return view;
    }
}
