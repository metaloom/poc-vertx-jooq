package io.metaloom.poc.util;

import java.util.Optional;

import io.reactivex.Maybe;

public final class RxUtil {

	private RxUtil() {
	}

	/**
	 * Convert the nullable element into a maybe.
	 * 
	 * @param <T>
	 * @param value
	 * @return
	 */
	public static <T> Maybe<T> ofNullable(T value) {
		return value == null ? Maybe.empty() : Maybe.just(value);
	}

	public static <T> Maybe<T> ofOptional(Optional<T> optional) {
		if (optional == null) {
			return Maybe.empty();
		}
		if (optional.isEmpty()) {
			return Maybe.empty();
		} else {
			return Maybe.just(optional.get());
		}
	}
}
