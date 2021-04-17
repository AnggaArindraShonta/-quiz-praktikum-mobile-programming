package com.example.quizpraktikum.ui.sigin;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.quizpraktikum.SharedPref.SharedPrefManager;

public class SignInViewModelFactory implements ViewModelProvider.Factory {
    private final SharedPrefManager prefManager;

    public SignInViewModelFactory(SharedPrefManager prefManager) {
        this.prefManager = prefManager;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new SignInViewModel(prefManager);
    }
}