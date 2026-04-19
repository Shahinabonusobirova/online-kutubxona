let searchInput = document.getElementById("searchInput");
let books = document.querySelectorAll(".book");

searchInput.addEventListener("keyup", function () {
    let qidiruv = searchInput.value.toLowerCase();

    books.forEach(function (book) {
        let text = book.innerText.toLowerCase();

        if (text.includes(qidiruv)) {
            book.style.display = "block";
        } else {
            book.style.display = "none";
        }
    });
});