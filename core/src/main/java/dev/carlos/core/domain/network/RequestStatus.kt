package dev.carlos.core.domain.network

sealed class RequestStatus {
    object Ready : RequestStatus()
    object Loading : RequestStatus()
    object Errored : RequestStatus()
    object Empty : RequestStatus()
}
