package com.mobotechnology.bipinpandey.mvp_hand_dirty.main_activity.presenter;

import com.mobotechnology.bipinpandey.mvp_hand_dirty.main_activity.model.User;

/**
 * Created by bpn on 11/30/17.
 */

public class MainActivityPresenter {

    User user;
    View view;

    public MainActivityPresenter(View view) {
        this.user = new User();
        this.view = view;
    }

    public void updateFullName(String fullName){
        user.setFullName(fullName);
        view.updateUserInfoTextView(user.toString());

    }

    public void updateEmail(String email){
        user.setEmail(email);
        view.updateUserInfoTextView(user.toString());

    }

    public interface View{

        void updateUserInfoTextView(String info);

    }
}
