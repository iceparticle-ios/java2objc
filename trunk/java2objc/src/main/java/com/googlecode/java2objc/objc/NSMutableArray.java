/*
 * Copyright (C) 2009 Inderjeet Singh
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.googlecode.java2objc.objc;

import java.util.Collection;

/**
 * Objective C standard NSMutableArray class. It is used to substitute for Java Collections
 * 
 * @author Inderjeet Singh
 */
public final class NSMutableArray extends ObjcTypeStandard {
    
  public static final String[] JAVA_TYPES = {"Collection", "java.util.Collection", "List", "java.util.List",
    "ArrayList", "java.util.ArrayList"
  };
  NSMutableArray(CompilationContext context) {
    super(context, "NSMutableArray", JavaClass.getJavaClassFor(Collection.class));
  }
}
