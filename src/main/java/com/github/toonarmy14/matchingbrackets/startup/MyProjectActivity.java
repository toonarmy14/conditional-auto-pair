package com.github.toonarmy14.matchingbrackets.startup;

import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.ProjectActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {2, 1, 0},
    k = 1,
    xi = 48,
    d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\b¨\u0006\t"},
    d2 = {"Lcom/github/toonarmy14/matchingbrackets/startup/MyProjectActivity;", "Lcom/intellij/openapi/startup/ProjectActivity;", "<init>", "()V", "execute", "", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Sources of conditional-auto-pair.main"}
)
@SourceDebugExtension({"SMAP\nMyProjectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyProjectActivity.kt\ncom/github/toonarmy14/matchingbrackets/startup/MyProjectActivity\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,13:1\n23#2:14\n*S KotlinDebug\n*F\n+ 1 MyProjectActivity.kt\ncom/github/toonarmy14/matchingbrackets/startup/MyProjectActivity\n*L\n10#1:14\n*E\n"})
public final class MyProjectActivity implements ProjectActivity {
    @Nullable
    public Object execute(@NotNull Project project, @NotNull Continuation $completion) {
        int $i$f$thisLogger = 0;
        Logger var10000 = Logger.getInstance(MyProjectActivity.class);
        Intrinsics.checkNotNullExpressionValue(var10000, "getInstance(...)");
        var10000.warn("Don't forget to remove all non-needed sample code files with their corresponding registration entries in `plugin.xml`.");
        return Unit.INSTANCE;
    }
}
