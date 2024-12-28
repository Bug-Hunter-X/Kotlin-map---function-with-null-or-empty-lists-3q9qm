# Kotlin map() function with null or empty lists

This example demonstrates unexpected behavior when using the `map()` function in Kotlin with null or empty lists.  The solution shows how to handle these cases gracefully.

## Bug

The original code uses the `map()` function with a nullable list.  The behavior is unexpected because the result is `null`, not an empty list.

## Solution

The solution uses the safe call operator (`?.`) to handle the case where the list is null, and the `orEmpty()` function to ensure that the result is an empty list if the list is null.
