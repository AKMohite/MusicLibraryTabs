package com.example.admin.musiclibrarytabs.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.admin.musiclibrarytabs.R;
import com.example.admin.musiclibrarytabs.adapter.PlaylistAdapter;
import com.example.admin.musiclibrarytabs.entities.PlaylistObject;

import java.util.ArrayList;
import java.util.List;

public class PlaylistFragment extends Fragment {

    public PlaylistFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_playlist, container, false);

        RecyclerView playlisRecyclerView = (RecyclerView)view.findViewById(R.id.your_play_list);
        GridLayoutManager gridLayout = new GridLayoutManager(getActivity(), 2);
        playlisRecyclerView.setLayoutManager(gridLayout);
        playlisRecyclerView.setHasFixedSize(true);

        PlaylistAdapter mAdapter = new PlaylistAdapter(getActivity(), getTestData());
        playlisRecyclerView.setAdapter(mAdapter);

        return view;
    }

    public List<PlaylistObject> getTestData() {
        List<PlaylistObject> trackList = new ArrayList<PlaylistObject>();
        trackList.add(new PlaylistObject("Falling over", "12 tracks", ""));
        trackList.add(new PlaylistObject("Falling over", "12 tracks", ""));
        trackList.add(new PlaylistObject("Falling over", "12 tracks", ""));
        trackList.add(new PlaylistObject("Falling over", "12 tracks", ""));
        trackList.add(new PlaylistObject("Falling over", "12 tracks", ""));
        trackList.add(new PlaylistObject("Falling over", "12 tracks", ""));
        trackList.add(new PlaylistObject("Falling over", "12 tracks", ""));
        trackList.add(new PlaylistObject("Falling over", "12 tracks", ""));
        return trackList;
    }
}
