package com.kaspersky.kaspresso.testcases.models

internal class InternalStepInfo(
    override val description: String,
    override val testClassName: String,
    override val level: Int,
    override val number: String,
    override val ordinal: Int,
    // position on each level of step hierarchy
    val stepNumber: MutableList<Int>,
    // internal mutable properties to hide mutability from users
    val parentStep: InternalStepInfo? = null,
    val internalSubSteps: MutableList<InternalStepInfo> = mutableListOf(),
    var internalStatus: StepStatus = StepStatus.STARTED,
    var internalThrowable: Throwable? = null
) : StepInfo {

    override val subSteps: List<StepInfo>
        get() = internalSubSteps
    override val status: StepStatus
        get() = internalStatus
    override val throwable: Throwable?
        get() = internalThrowable

    override fun toString(): String {
        return "Step(" +
                "description=$description, " +
                "testClassName=$testClassName, " +
                "level=$level, number=$number, " +
                "ordinal=$ordinal, " +
                "stepNumber=$stepNumber, " +
                "subSteps=$internalSubSteps" +
                ")"
    }

}
