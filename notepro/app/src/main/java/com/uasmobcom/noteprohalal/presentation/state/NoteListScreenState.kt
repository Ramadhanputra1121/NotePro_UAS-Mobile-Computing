package com.uasmobcom.noteprohalal.presentation.state

import com.uasmobcom.noteprohalal.domain.Notes

data class NoteListScreenState(var list: List<Notes> = emptyList())
