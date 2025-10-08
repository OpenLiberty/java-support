// /*
//  * Licensed to the University Corporation for Advanced Internet Development,
//  * Inc. (UCAID) under one or more contributor license agreements.  See the
//  * NOTICE file distributed with this work for additional information regarding
//  * copyright ownership. The UCAID licenses this file to You under the Apache
//  * License, Version 2.0 (the "License"); you may not use this file except in
//  * compliance with the License.  You may obtain a copy of the License at
//  *
//  *    http://www.apache.org/licenses/LICENSE-2.0
//  *
//  * Unless required by applicable law or agreed to in writing, software
//  * distributed under the License is distributed on an "AS IS" BASIS,
//  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  * See the License for the specific language governing permissions and
//  * limitations under the License.
//  */

// package net.shibboleth.utilities.java.support.primitive;

// import javax.annotation.Nonnull;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

// /**
//  * Utility methods to provide a Cleaner-like API that works on Java 8 and newer JDKs.
//  *
//  * Exposes a minimal subset of the Cleaner API used by this codebase: a Cleaner-like object with
//  * register(owner, Runnable) returning a Cleanable-like handle which has clean().
//  */
// public final class CleanerSupport {

//     /** Logger. */
//     private static final Logger LOG = LoggerFactory.getLogger(CleanerSupport.class);

//     private CleanerSupport() {
//     }

//     /** Minimal Cleaner-like API surface used by the project. */
//     public interface CleanerLike {
//         CleanerCompat.Cleanable register(Object owner, Runnable action);
//     }

//     /**
//      * Obtain a new Cleaner-like instance. Implementation uses CleanerCompat on Java 8.
//      *
//      * @param requester the class which requests the cleaner instance
//      * @return a CleanerLike instance
//      */
//     public static CleanerLike getInstance(@Nonnull final Class<?> requester) {
//         LOG.debug("Creating new CleanerCompat instance requested by class:  {}", requester.getName());
//         final CleanerCompat c = CleanerCompat.create();
//         return new CleanerLike() {
//             @Override
//             public CleanerCompat.Cleanable register(final Object owner, final Runnable action) {
//                 return c.register(owner, action);
//             }
//         };
//     }

// }
