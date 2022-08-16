 FROM golang:1.15.10 as builder

RUN go get -u github.com/pierrec/lz4 && cd /go/src/github.com/pierrec/lz4 && git fetch && git checkout v4 && cd /go/src/github.com
RUN go get -u github.com/google/go-cmp/cmp

RUN go get golang.org/x/net/html/atom
RUN go get golang.org/x/net/html
RUN go get github.com/disintegration/imaging

RUN mkdir /go/src/prueba

COPY ./prueba/ /go/src/prueba
WORKDIR /go/src/prueba

EXPOSE 1000

CMD go run main.go
