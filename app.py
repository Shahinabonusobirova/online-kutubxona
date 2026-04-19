from flask import Flask, render_template, send_file

app = Flask("online_kutubxona")

@app.route("/")
def home():
    return render_template("index.html")

@app.route("/download/<filename>")
def download(filename):
    return send_file("books/" + filename, as_attachment=True)
if __name__=="__main__":
    app.run(host="0.0.0.0", port=5000, debug=True)