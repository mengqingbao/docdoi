package com.docdoi.activity;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.docdoi.adapter.Fr2ListAdapter;
import com.docdoi.listener.Fr2ItemOnClickListener;
import com.docdoi.listener.Fr3ItemOnClickListener;
import com.docdoi.model.Care;
import com.docdoi.persistence.CareStore;

public class FragmentPage2 extends Fragment{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_2, container, false);
		ListView listView = (ListView) view.findViewById(R.id.fragment_2_list);
		List<Care> list = CareStore.getInstance().queryPageList(0, 10, this.getActivity());
		Fr2ListAdapter fla=new Fr2ListAdapter(this.getActivity(),R.layout.in_frag2_list_item,list);
		listView.setAdapter(fla);
		listView.setOnItemClickListener(new Fr2ItemOnClickListener(this.getActivity()));
		return view;
	}
}
