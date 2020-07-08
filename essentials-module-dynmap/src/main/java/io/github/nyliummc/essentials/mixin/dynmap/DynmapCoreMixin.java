/*
 * MIT License
 *
 * Copyright (c) NyliumMC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package io.github.nyliummc.essentials.mixin.dynmap;

import io.github.nyliummc.essentials.api.EssentialsMod;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.commons.io.IOUtils;
import org.dynmap.DynmapCore;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.io.*;

@Mixin(value={DynmapCore.class}, remap=false)
class DynmapCoreMixin {
    @Redirect(method="initConfiguration", at=@At(value="NEW", target="Ljava/io/File;", ordinal=0))
    File configFile(File parent, String child) throws IOException {
        File f = new File(FabricLoader.getInstance().getConfigDirectory().getCanonicalPath() + "/essentials-dynmap.yaml");
        if (!f.exists()) {
            f.createNewFile();
            InputStream in = this.getClass().getClassLoader().getResourceAsStream("essentials-dynmap.yaml");
            OutputStream out = new FileOutputStream(f);
            IOUtils.copy(in, out);
        }
        return f;
    }
}
