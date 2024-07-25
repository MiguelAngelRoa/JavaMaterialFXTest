package com.materialfxtest.views;

import com.materialfxtest.models.DataDashboard;

import java.util.ArrayList;

public interface DashboardView {
    public void onDataSuccess(ArrayList<DataDashboard> data);
    public void onFailure(String message);
}
