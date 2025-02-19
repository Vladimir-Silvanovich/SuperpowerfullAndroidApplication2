package com.example.chudoapplication.presentation.signIn

import android.util.Log
import android.util.Patterns.EMAIL_ADDRESS
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.chudoapplication.data.network.supabase
import com.example.chudoapplication.domain.models.UserModel
import io.github.jan.supabase.auth.auth
import io.github.jan.supabase.auth.status.SessionSource
import io.github.jan.supabase.auth.status.SessionStatus
import io.github.jan.supabase.postgrest.from
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
class SignInViewModel constructor(
) : ViewModel() {

    private val _isSignUpSuccessful = MutableSharedFlow<Unit>()
    val isSignUpSuccessful: SharedFlow<Unit> = _isSignUpSuccessful

    private val _showAccountNotExistedError = MutableSharedFlow<Unit>()
    val showAccountNotExistedError: SharedFlow<Unit> = _showAccountNotExistedError

    private val _email = MutableStateFlow("")
    val email: StateFlow<String> = _email

    private val _password = MutableStateFlow("")
    val password: StateFlow<String> = _password

    fun onEmailChange(newEmail: String) {
        _email.value = newEmail
    }

    fun onRemoveText() {
        _email.value = ""
    }

    fun onPasswordChange(newPassword: String) {
        _password.value = newPassword
    }

    fun isValidEmail(): Boolean {
        return EMAIL_ADDRESS.matcher(_email.value).matches()
    }

    fun signIn() {
    }
}

