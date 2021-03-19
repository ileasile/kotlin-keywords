package ru.ileasile.kotlin.keywords

object IdValidator {
    private val idRegex = """(^[0-9])|[ {}()<>'"/|.\\!?@:;%^&*#$-]""".toRegex()

    fun isValidId(name: String): Boolean {
        return name.contains(idRegex) || name in HardKeywords.VALUES
    }
}
