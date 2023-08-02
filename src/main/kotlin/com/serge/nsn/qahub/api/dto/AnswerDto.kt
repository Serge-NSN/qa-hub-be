package com.serge.nsn.qahub.api.dto

import com.serge.nsn.qahub.data.entities.AnswerEntity

class AnswerDto(
    val id: Long? = null,
    val content: String = "",
    val author: String= ""
) {
    constructor(answerEntity: AnswerEntity) : this(
        id = answerEntity.id,
        content = answerEntity.content,
        author = answerEntity.author
    )
}