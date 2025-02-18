package annotations.advancedlevel.cacheresultannotation;

import java.lang.reflect.*;
import java.util.HashMap;
import java.util.Map;

class CacheHandler implements InvocationHandler {
    private final Object target;
    private final Map<String, Object> cache = new HashMap<>();

    public CacheHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Check if the method is annotated with @CacheResult
        if (method.isAnnotationPresent(CacheResult.class)) {
            String key = method.getName() + "_" + args[0]; // Create cache key

            if (cache.containsKey(key)) {
                System.out.println("Returning cached result for: " + args[0]);
                return cache.get(key);
            }
            // Call the actual method
            Object result = method.invoke(target, args);
            // Store result in cache
            cache.put(key, result);

            return result;
        }

        return method.invoke(target, args);
    }
}

