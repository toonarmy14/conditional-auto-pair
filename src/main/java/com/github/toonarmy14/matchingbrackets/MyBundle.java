// MyBundle.java
package com.github.toonarmy14.matchingbrackets;

import com.intellij.DynamicBundle;
import java.util.Arrays;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.PropertyKey;

@Metadata(
    mv = {2, 1, 0},
    k = 1,
    xi = 48,
    d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00070\u0005¢\u0006\u0002\b\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00052\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0007¢\u0006\u0002\u0010\u000bJ1\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\b\b\u0001\u0010\u0007\u001a\u00020\u00052\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"},
    d2 = {"Lcom/github/toonarmy14/matchingbrackets/MyBundle;", "Lcom/intellij/DynamicBundle;", "<init>", "()V", "message", "", "Lorg/jetbrains/annotations/Nls;", "key", "params", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "messagePointer", "Ljava/util/function/Supplier;", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/function/Supplier;", "Sources of conditional-auto-pair.main"}
)
public final class MyBundle extends DynamicBundle {
    @NotNull
    public static final MyBundle INSTANCE = new MyBundle();

    private MyBundle() {
        super("messages.MyBundle");
    }

    @JvmStatic
    @NotNull
    public static final String message(@PropertyKey(resourceBundle = "messages.MyBundle") @NotNull String key, @NotNull Object... params) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(params, "params");
        return INSTANCE.getMessage(key, Arrays.copyOf(params, params.length));
    }

    @JvmStatic
    @NotNull
    public static final Supplier messagePointer(@PropertyKey(resourceBundle = "messages.MyBundle") @NotNull String key, @NotNull Object... params) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(params, "params");
        return INSTANCE.getLazyMessage(key, Arrays.copyOf(params, params.length));
    }
}
