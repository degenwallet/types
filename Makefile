install:
	cargo install typeshare-cli

generate:
	typeshare ./ --lang=swift --output-file=generated/model.swift
	typeshare ./ --lang=kotlin --output-file=generated/model.kt