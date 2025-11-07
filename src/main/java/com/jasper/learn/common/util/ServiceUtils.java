package com.jasper.learn.common.util;

import com.jasper.learn.common.exception.ResourceNotFoundException;

import java.util.Optional;

public class ServiceUtils {
    private ServiceUtils() {}

    public static <T> T orNotFound(Optional<T> optional, String message) {
        return optional.orElseThrow(() -> new ResourceNotFoundException(message));
    }
}
