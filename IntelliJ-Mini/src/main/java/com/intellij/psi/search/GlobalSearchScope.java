/*
 * Copyright 2000-2016 JetBrains s.r.o.
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
package com.intellij.psi.search;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;

public class GlobalSearchScope extends SearchScope {

    public static GlobalSearchScope allScope(Project project) {
        return new GlobalSearchScope();
    }

    @NotNull
    @Override
    public SearchScope intersectWith(@NotNull SearchScope scope2) {
        return null;
    }

    @NotNull
    @Override
    public SearchScope union(@NotNull SearchScope scope) {
        return null;
    }

    @Override
    public boolean contains(@NotNull VirtualFile file) {
        return false;
    }
}