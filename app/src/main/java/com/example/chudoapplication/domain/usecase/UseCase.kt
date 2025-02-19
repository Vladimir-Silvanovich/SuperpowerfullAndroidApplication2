package com.example.chudoapplication.domain.usecase

interface SuspendUseCase<Input, Output> {
    suspend operator fun invoke(input: Input): Output
}

interface UseCase<Input, Output> {
    operator fun invoke(input: Input): Output
}
