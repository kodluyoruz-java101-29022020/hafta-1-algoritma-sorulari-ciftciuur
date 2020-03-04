package org.kodluyoruz.questions.six;

public class QuestionSix {
	public static void main(String[] args) {
		PDFDocument pdfDocument = new PDFDocument("pdfDocumentBody");
		WordDocument wordDocument = new WordDocument("wordDocumentBody");
		Printer.printPDFDocument(pdfDocument);
		Printer.printWordDocument(wordDocument);
	}
}
