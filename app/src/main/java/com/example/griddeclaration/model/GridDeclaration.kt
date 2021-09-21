package com.example.griddeclaration.model

data class GridDeclaration(
    val cardTitle: Array<String>,
    val cardImage: Array<String>
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as GridDeclaration

        if (!cardTitle.contentEquals(other.cardTitle)) return false
        if (!cardImage.contentEquals(other.cardImage)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = cardTitle.contentHashCode()
        result = 31 * result + cardImage.contentHashCode()
        return result
    }
}