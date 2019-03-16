const AdForm = {
  isbn: {
    min: 10,
    max: 13,
  },
  new: () => {
    return Object.freeze(new ImplAdForm());
  }
};

function ImplAdForm(openbookApi) {

    this.openbookApi = openbookApi;

    this.form = "#create-ad";
    this.price = {
      label: "#ad-price",
      field: "#create-ad-price",
    };
    this.shipping = {
      label: "#ad-shipping",
      field: "#create-ad-shipping",
    };
    this.tradable = {
      label: "#ad-tradable",
      field: "#create-ad-tradable",
    };
    this.book = {
      label: "#ad-new-book",
      button: "#btn-ad-new-book",
      form: "#ad-new-book-form",
    };

    this.submit = {
      label: "#ad-submit-all",
      button: "#btn-ad-submit-all",
    };
    // all book forms are listed in the following array
    this.bookforms = [];

    this.bookCount = () => {
        return this.bookforms.length;
    };

    this.getIsbnSize = () => {
        return AdForm.isbn;
    };

    this.addBookForm = (bookform) => {
        // add the book form to a list of bookforms
        this.bookforms.push(bookform);
        // embed the new form in the html
        $(this.form).append(bookform.toHtml());
        // watch the for the user's input into the isbn field
        let isbn = "";
        $(bookform.isbn).on("keyup", () => {
           isbn = $(bookform.isbn).val();
           if(isbn.length == AdForm.isbn.min || isbn.length == AdForm.isbn.max){
               console.log(isbn);
           }
        });
    };
}
