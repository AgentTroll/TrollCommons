/*
 * Copyright 2014 AgentTroll
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gmail.woodyc40.commons.collect;

/**
 * A simplified unique key mapping used to store values
 *
 * @param <K> the key type
 * @param <V> the value type
 */
public interface Cache<K, V> {
    /**
     * Finds the cached value stored by key
     *
     * @param k the key for the requested value
     * @return the value associated with the key
     */
    V lookup(K k);

    /**
     * Associates a value with the key
     *
     * @param k the key to associate with the value
     * @param v the value associated with the key
     * @return the value inserted
     */
    V insert(K k, V v);
}
