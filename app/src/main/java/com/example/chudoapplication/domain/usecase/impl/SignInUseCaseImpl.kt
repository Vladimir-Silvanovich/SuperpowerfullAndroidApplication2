package com.example.chudoapplication.domain.usecase.impl

import com.example.chudoapplication.data.repository.UserRepository
import com.example.chudoapplication.domain.usecase.SignInUseCase
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

class SignInUseCaseImpl(
    private val userRepository: UserRepository,
    private val ioDispatcher: CoroutineDispatcher,
) :
    SignInUseCase {
    override suspend fun invoke(input: SignInUseCase.Input): SignInUseCase.Output {
        return withContext(ioDispatcher) {
            try {
                val res = userRepository.authenticate(input.email, input.password)
                SignInUseCase.Output(res)
            } catch (e: Exception) {
                SignInUseCase.Output.AccountNotExistedError
            }
        }
    }
}