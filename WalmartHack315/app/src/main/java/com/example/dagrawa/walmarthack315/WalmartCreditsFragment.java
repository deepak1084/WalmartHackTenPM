package com.example.dagrawa.walmarthack315;

/**
 * Created by hp on 02-04-2016.
 */


        import android.annotation.TargetApi;
        import android.app.Fragment;
        import android.os.Build;
        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class WalmartCreditsFragment extends Fragment {

    public WalmartCreditsFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_pages, container, false);

        return rootView;
    }
}
