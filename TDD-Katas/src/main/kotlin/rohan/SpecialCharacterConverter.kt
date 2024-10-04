package org.example.rohan

import java.text.Normalizer
import java.util.regex.Pattern

object SpecialCharacterConverter {
    private fun removeDiacritics(input: String?): String {
        val normalized = Normalizer.normalize(input, Normalizer.Form.NFD)
        val pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+")
        return pattern.matcher(normalized).replaceAll("")
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val input = "Konrad Dębski, ZELİHA ZUHAL YURDABAKAN , Şafak ULUSOY, vDDFáquéz Garciá Zöe Eleñaendof2line"
        val asciiFriendly = removeDiacritics(input)
        println("Original      : $input")
        println("ASCII-Friendly: $asciiFriendly")
        println("------------------------------------------------")

        val input1 = "ą, ć, ę, ł, ń, ó, ś, ź, ż, à, â, ç, é, è, ê, ë, î, ï, ô, ù, û, ü,á, é, í, ó, ú, ñ, ä, ö, ü, ß, ã, õ, ç, à, á, â, ê, é, í, ó, ô, ú, ç, ğ, ı, İ, ö, ş, ü, á, é, í, ó, ö, ő, ú, ü, ű,á, č, ď, ě, é, ň, ř, š, ť, ú, ů, ý, ž"
        val asciiFriendly1 = removeDiacritics(input1)
        println("Original      : $input1")
        println("ASCII-Friendly: $asciiFriendly1")
    }
}

//(ą, ć, ę, ł, ń, ó, ś, ź, ż, à, â, ç, é, è, ê, ë, î, ï, ô, ù, û, ü,á, é, í, ó, ú, ñ, ä, ö, ü, ß, ã, õ, ç, à, á, â, ê, é, í, ó, ô, ú, ç, ğ, ı, İ, ö, ş, ü, á, é, í, ó, ö, ő, ú, ü, ű,á, č, ď, ě, é, ň, ř, š, ť, ú, ů, ý, ž)
//("ą","ć","ę","ł","ń","ó","ś","ź","ż","à","â","ç","é","è","ê","ë","î","ï","ô","ù","û","ü,á","é","í","ó","ú","ñ","ä","ö","ü","ß","ã","õ","ç","à","á","â","ê","é","í","ó","ô","ú","ç","ğ","ı","İ","ö","ş","ü","á","é","í","ó","ö","ő","ú","ü","ű,á","č","ď","ě","é","ň","ř","š","ť","ú","ů","ý","ž")


