package net.fabricmc.fabric.api.util;

import org.jetbrains.annotations.NotNull;

public class Identifier implements Comparable<Identifier> {
	public String namespace;
	public String path;

	public Identifier(String namespace,  String path) {
		this.namespace = namespace;
		this.path = path;
	}

	@Override
	public String toString() {
		return this.namespace + ":" + this.path;
	}

	@Override
	public int compareTo(@NotNull Identifier identifier) {
		int i = this.path.compareTo(identifier.path);
		if (i == 0) {
			i = this.namespace.compareTo(identifier.namespace);
		}

		return i;
	}
}
