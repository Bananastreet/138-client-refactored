public class NodeSub8Sub2 extends NodeSub8 {

	int anInt412;
	int anInt413;
	boolean aBool51;
	int anInt405;
	int anInt407;
	int anInt415;
	int anInt410;
	int anInt414;
	int anInt409;
	int anInt416;
	int anInt417;
	int anInt408;
	int anInt404;
	int anInt406;
	int anInt411;

	int method301() {
		int var1 = anInt408 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (anInt411 == 0) {
			var1 -= var1 * anInt410 / (((NodeSub6Sub1) aNodeSub6_1).aByteArray23.length << 8);
		} else if (anInt411 >= 0) {
			var1 -= var1 * anInt412 / ((NodeSub6Sub1) aNodeSub6_1).aByteArray23.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	NodeSub8Sub2(NodeSub6Sub1 var1, int var2, int var3) {
		aNodeSub6_1 = var1;
		anInt412 = var1.anInt418;
		anInt413 = var1.anInt419;
		aBool51 = var1.aBool52;
		anInt405 = var2;
		anInt407 = var3;
		anInt415 = 8192;
		anInt410 = 0;
		method432();
	}

	NodeSub8Sub2(NodeSub6Sub1 var1, int var2, int var3, int var4) {
		aNodeSub6_1 = var1;
		anInt412 = var1.anInt418;
		anInt413 = var1.anInt419;
		aBool51 = var1.aBool52;
		anInt405 = var2;
		anInt407 = var3;
		anInt415 = var4;
		anInt410 = 0;
		method432();
	}

	void method413() {
		if (anInt414 != 0) {
			if (anInt407 == Integer.MIN_VALUE) {
				anInt407 = 0;
			}

			anInt414 = 0;
			method432();
		}

	}

	public synchronized void method414(boolean var1) {
		anInt405 = (anInt405 ^ anInt405 >> 31) + (anInt405 >>> 31);
		if (var1) {
			anInt405 = -anInt405;
		}

	}

	synchronized void method415(int var1) {
		method416(var1, method418());
	}

	synchronized void method416(int var1, int var2) {
		anInt407 = var1;
		anInt415 = var2;
		anInt414 = 0;
		method432();
	}

	public synchronized int method417() {
		return anInt407 == Integer.MIN_VALUE ? 0 : anInt407;
	}

	public synchronized int method418() {
		return anInt415 < 0 ? -1 : anInt415;
	}

	public synchronized void method419(int var1) {
		int var2 = ((NodeSub6Sub1) aNodeSub6_1).aByteArray23.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		anInt410 = var1;
	}

	public synchronized void method420(int var1) {
		method416(var1 << 6, method418());
	}

	public synchronized void method421(int var1, int var2) {
		method422(var1, var2, method418());
	}

	public synchronized void method422(int var1, int var2, int var3) {
		if (var1 == 0) {
			method416(var2, var3);
		} else {
			int var4 = Static.staticMethod367(var2, var3);
			int var6 = Static.staticMethod370(var2, var3);
			if (anInt406 == var4 && anInt404 == var6) {
				anInt414 = 0;
			} else {
				int var5 = var2 - anInt408;
				if (anInt408 - var2 > var5) {
					var5 = anInt408 - var2;
				}

				if (var4 - anInt406 > var5) {
					var5 = var4 - anInt406;
				}

				if (anInt406 - var4 > var5) {
					var5 = anInt406 - var4;
				}

				if (var6 - anInt404 > var5) {
					var5 = var6 - anInt404;
				}

				if (anInt404 - var6 > var5) {
					var5 = anInt404 - var6;
				}

				if (var1 > var5) {
					var1 = var5;
				}

				anInt414 = var1;
				anInt407 = var2;
				anInt415 = var3;
				anInt409 = (var2 - anInt408) / var1;
				anInt416 = (var4 - anInt406) / var1;
				anInt417 = (var6 - anInt404) / var1;
			}
		}

	}

	public synchronized void method423(int var1) {
		if (var1 == 0) {
			method415(0);
			method174();
		} else if (anInt406 == 0 && anInt404 == 0) {
			anInt414 = 0;
			anInt407 = 0;
			anInt408 = 0;
			method174();
		} else {
			int var2 = -anInt408;
			if (anInt408 > var2) {
				var2 = anInt408;
			}

			if (-anInt406 > var2) {
				var2 = -anInt406;
			}

			if (anInt406 > var2) {
				var2 = anInt406;
			}

			if (-anInt404 > var2) {
				var2 = -anInt404;
			}

			if (anInt404 > var2) {
				var2 = anInt404;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			anInt414 = var1;
			anInt407 = Integer.MIN_VALUE;
			anInt409 = -anInt408 / var1;
			anInt416 = -anInt406 / var1;
			anInt417 = -anInt404 / var1;
		}

	}

	public synchronized void method424(int var1) {
		if (anInt405 < 0) {
			anInt405 = -var1;
		} else {
			anInt405 = var1;
		}

	}

	public synchronized int method425() {
		return anInt405 < 0 ? -anInt405 : anInt405;
	}

	boolean method426() {
		int var1 = anInt407;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = Static.staticMethod367(var1, anInt415);
			var3 = Static.staticMethod370(var1, anInt415);
		}

		if (anInt408 == var1 && anInt406 == var2 && anInt404 == var3) {
			if (anInt407 == Integer.MIN_VALUE) {
				anInt407 = 0;
				anInt404 = 0;
				anInt406 = 0;
				anInt408 = 0;
				method174();
				return true;
			} else {
				method432();
				return false;
			}
		} else {
			if (anInt408 < var1) {
				anInt409 = 1;
				anInt414 = var1 - anInt408;
			} else if (anInt408 > var1) {
				anInt409 = -1;
				anInt414 = anInt408 - var1;
			} else {
				anInt409 = 0;
			}

			if (anInt406 < var2) {
				anInt416 = 1;
				if (anInt414 == 0 || anInt414 > var2 - anInt406) {
					anInt414 = var2 - anInt406;
				}
			} else if (anInt406 > var2) {
				anInt416 = -1;
				if (anInt414 == 0 || anInt414 > anInt406 - var2) {
					anInt414 = anInt406 - var2;
				}
			} else {
				anInt416 = 0;
			}

			if (anInt404 < var3) {
				anInt417 = 1;
				if (anInt414 == 0 || anInt414 > var3 - anInt404) {
					anInt414 = var3 - anInt404;
				}
			} else if (anInt404 > var3) {
				anInt417 = -1;
				if (anInt414 == 0 || anInt414 > anInt404 - var3) {
					anInt414 = anInt404 - var3;
				}
			} else {
				anInt417 = 0;
			}

			return false;
		}
	}

	public boolean method427() {
		return anInt414 != 0;
	}

	protected NodeSub8 method302() {
		return null;
	}

	protected NodeSub8 method303() {
		return null;
	}

	protected int method304() {
		return anInt407 == 0 && anInt414 == 0 ? 0 : 1;
	}

	public synchronized void method306(int[] var1, int var2, int var3) {
		if (anInt407 == 0 && anInt414 == 0) {
			method305(var3);
		} else {
			NodeSub6Sub1 var9 = (NodeSub6Sub1) aNodeSub6_1;
			int var5 = anInt412 << 8;
			int var6 = anInt413 << 8;
			int var10 = var9.aByteArray23.length << 8;
			int var7 = var6 - var5;
			if (var7 <= 0) {
				anInt411 = 0;
			}

			int var8 = var2;
			var3 += var2;
			if (anInt410 < 0) {
				if (anInt405 <= 0) {
					method413();
					method174();
					return;
				}

				anInt410 = 0;
			}

			if (anInt410 >= var10) {
				if (anInt405 >= 0) {
					method413();
					method174();
					return;
				}

				anInt410 = var10 - 1;
			}

			if (anInt411 < 0) {
				if (aBool51) {
					if (anInt405 < 0) {
						var8 = method429(var1, var2, var5, var3, var9.aByteArray23[anInt412]);
						if (anInt410 >= var5) {
							return;
						}

						anInt410 = var5 + var5 - 1 - anInt410;
						anInt405 = -anInt405;
					}

					while (true) {
						var8 = method428(var1, var8, var6, var3, var9.aByteArray23[anInt413 - 1]);
						if (anInt410 < var6) {
							return;
						}

						anInt410 = var6 + var6 - 1 - anInt410;
						anInt405 = -anInt405;
						var8 = method429(var1, var8, var5, var3, var9.aByteArray23[anInt412]);
						if (anInt410 >= var5) {
							return;
						}

						anInt410 = var5 + var5 - 1 - anInt410;
						anInt405 = -anInt405;
					}
				}

				if (anInt405 < 0) {
					while (true) {
						var8 = method429(var1, var8, var5, var3, var9.aByteArray23[anInt413 - 1]);
						if (anInt410 >= var5) {
							return;
						}

						anInt410 = var6 - 1 - (var6 - 1 - anInt410) % var7;
					}
				}

				while (true) {
					var8 = method428(var1, var8, var6, var3, var9.aByteArray23[anInt412]);
					if (anInt410 < var6) {
						return;
					}

					anInt410 = var5 + (anInt410 - var5) % var7;
				}
			}

			if (anInt411 > 0) {
				if (aBool51) {
					label118: {
						if (anInt405 < 0) {
							var8 = method429(var1, var2, var5, var3, var9.aByteArray23[anInt412]);
							if (anInt410 >= var5) {
								return;
							}

							anInt410 = var5 + var5 - 1 - anInt410;
							anInt405 = -anInt405;
							if (--anInt411 == 0) {
								break label118;
							}
						}

						do {
							var8 = method428(var1, var8, var6, var3, var9.aByteArray23[anInt413 - 1]);
							if (anInt410 < var6) {
								return;
							}

							anInt410 = var6 + var6 - 1 - anInt410;
							anInt405 = -anInt405;
							if (--anInt411 == 0) {
								break;
							}

							var8 = method429(var1, var8, var5, var3, var9.aByteArray23[anInt412]);
							if (anInt410 >= var5) {
								return;
							}

							anInt410 = var5 + var5 - 1 - anInt410;
							anInt405 = -anInt405;
						} while (--anInt411 != 0);
					}
				} else {
					int var4;
					if (anInt405 < 0) {
						while (true) {
							var8 = method429(var1, var8, var5, var3, var9.aByteArray23[anInt413 - 1]);
							if (anInt410 >= var5) {
								return;
							}

							var4 = (var6 - 1 - anInt410) / var7;
							if (var4 >= anInt411) {
								anInt410 += var7 * anInt411;
								anInt411 = 0;
								break;
							}

							anInt410 += var7 * var4;
							anInt411 -= var4;
						}
					} else {
						while (true) {
							var8 = method428(var1, var8, var6, var3, var9.aByteArray23[anInt412]);
							if (anInt410 < var6) {
								return;
							}

							var4 = (anInt410 - var5) / var7;
							if (var4 >= anInt411) {
								anInt410 -= var7 * anInt411;
								anInt411 = 0;
								break;
							}

							anInt410 -= var7 * var4;
							anInt411 -= var4;
						}
					}
				}
			}

			if (anInt405 < 0) {
				method429(var1, var8, 0, var3, 0);
				if (anInt410 < 0) {
					anInt410 = -1;
					method413();
					method174();
				}
			} else {
				method428(var1, var8, var10, var3, 0);
				if (anInt410 >= var10) {
					anInt410 = var10;
					method413();
					method174();
				}
			}
		}

	}

	int method428(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (anInt414 > 0) {
				int var6 = var2 + anInt414;
				if (var6 > var4) {
					var6 = var4;
				}

				anInt414 += var2;
				if (anInt405 == 256 && (anInt410 & 0xff) == 0) {
					if (Class19.staticBool5) {
						var2 = Static.staticMethod359(0, ((NodeSub6Sub1) aNodeSub6_1).aByteArray23, var1, anInt410,
								var2, anInt406, anInt404, anInt416, anInt417, 0, var6, var3, this);
					} else {
						var2 = Static.staticMethod369(((NodeSub6Sub1) aNodeSub6_1).aByteArray23, var1, anInt410, var2,
								anInt408, anInt409, 0, var6, var3, this);
					}
				} else if (Class19.staticBool5) {
					var2 = Static.staticMethod363(0, 0, ((NodeSub6Sub1) aNodeSub6_1).aByteArray23, var1, anInt410, var2,
							anInt406, anInt404, anInt416, anInt417, 0, var6, var3, this, anInt405, var5);
				} else {
					var2 = Static.staticMethod362(0, 0, ((NodeSub6Sub1) aNodeSub6_1).aByteArray23, var1, anInt410, var2,
							anInt408, anInt409, 0, var6, var3, this, anInt405, var5);
				}

				anInt414 -= var2;
				if (anInt414 != 0) {
					return var2;
				}

				if (!method426()) {
					continue;
				}

				return var4;
			}

			if (anInt405 == 256 && (anInt410 & 0xff) == 0) {
				if (Class19.staticBool5) {
					return Static.staticMethod354(0, ((NodeSub6Sub1) aNodeSub6_1).aByteArray23, var1, anInt410, var2,
							anInt406, anInt404, 0, var4, var3, this);
				}

				return Static.staticMethod353(((NodeSub6Sub1) aNodeSub6_1).aByteArray23, var1, anInt410, var2, anInt408,
						0, var4, var3, this);
			}

			if (Class19.staticBool5) {
				return Static.staticMethod356(0, 0, ((NodeSub6Sub1) aNodeSub6_1).aByteArray23, var1, anInt410, var2,
						anInt406, anInt404, 0, var4, var3, this, anInt405, var5);
			}

			return Static.staticMethod366(0, 0, ((NodeSub6Sub1) aNodeSub6_1).aByteArray23, var1, anInt410, var2,
					anInt408, 0, var4, var3, this, anInt405, var5);
		}
	}

	int method429(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (anInt414 > 0) {
				int var6 = var2 + anInt414;
				if (var6 > var4) {
					var6 = var4;
				}

				anInt414 += var2;
				if (anInt405 == -256 && (anInt410 & 0xff) == 0) {
					if (Class19.staticBool5) {
						var2 = Static.staticMethod361(0, ((NodeSub6Sub1) aNodeSub6_1).aByteArray23, var1, anInt410,
								var2, anInt406, anInt404, anInt416, anInt417, 0, var6, var3, this);
					} else {
						var2 = Static.staticMethod360(((NodeSub6Sub1) aNodeSub6_1).aByteArray23, var1, anInt410, var2,
								anInt408, anInt409, 0, var6, var3, this);
					}
				} else if (Class19.staticBool5) {
					var2 = Static.staticMethod365(0, 0, ((NodeSub6Sub1) aNodeSub6_1).aByteArray23, var1, anInt410, var2,
							anInt406, anInt404, anInt416, anInt417, 0, var6, var3, this, anInt405, var5);
				} else {
					var2 = Static.staticMethod364(0, 0, ((NodeSub6Sub1) aNodeSub6_1).aByteArray23, var1, anInt410, var2,
							anInt408, anInt409, 0, var6, var3, this, anInt405, var5);
				}

				anInt414 -= var2;
				if (anInt414 != 0) {
					return var2;
				}

				if (!method426()) {
					continue;
				}

				return var4;
			}

			if (anInt405 == -256 && (anInt410 & 0xff) == 0) {
				if (Class19.staticBool5) {
					return Static.staticMethod358(0, ((NodeSub6Sub1) aNodeSub6_1).aByteArray23, var1, anInt410, var2,
							anInt406, anInt404, 0, var4, var3, this);
				}

				return Static.staticMethod355(((NodeSub6Sub1) aNodeSub6_1).aByteArray23, var1, anInt410, var2, anInt408,
						0, var4, var3, this);
			}

			if (Class19.staticBool5) {
				return Static.staticMethod357(0, 0, ((NodeSub6Sub1) aNodeSub6_1).aByteArray23, var1, anInt410, var2,
						anInt406, anInt404, 0, var4, var3, this, anInt405, var5);
			}

			return Static.staticMethod368(0, 0, ((NodeSub6Sub1) aNodeSub6_1).aByteArray23, var1, anInt410, var2,
					anInt408, 0, var4, var3, this, anInt405, var5);
		}
	}

	public synchronized void method305(int var1) {
		if (anInt414 > 0) {
			if (var1 >= anInt414) {
				if (anInt407 == Integer.MIN_VALUE) {
					anInt407 = 0;
					anInt404 = 0;
					anInt406 = 0;
					anInt408 = 0;
					method174();
					var1 = anInt414;
				}

				anInt414 = 0;
				method432();
			} else {
				anInt408 += anInt409 * var1;
				anInt406 += anInt416 * var1;
				anInt404 += anInt417 * var1;
				anInt414 -= var1;
			}
		}

		NodeSub6Sub1 var5 = (NodeSub6Sub1) aNodeSub6_1;
		int var2 = anInt412 << 8;
		int var4 = anInt413 << 8;
		int var6 = var5.aByteArray23.length << 8;
		int var7 = var4 - var2;
		if (var7 <= 0) {
			anInt411 = 0;
		}

		if (anInt410 < 0) {
			if (anInt405 <= 0) {
				method413();
				method174();
				return;
			}

			anInt410 = 0;
		}

		if (anInt410 >= var6) {
			if (anInt405 >= 0) {
				method413();
				method174();
				return;
			}

			anInt410 = var6 - 1;
		}

		anInt410 += anInt405 * var1;
		if (anInt411 < 0) {
			if (!aBool51) {
				if (anInt405 < 0) {
					if (anInt410 >= var2) {
						return;
					}

					anInt410 = var4 - 1 - (var4 - 1 - anInt410) % var7;
				} else {
					if (anInt410 < var4) {
						return;
					}

					anInt410 = var2 + (anInt410 - var2) % var7;
				}
			} else {
				if (anInt405 < 0) {
					if (anInt410 >= var2) {
						return;
					}

					anInt410 = var2 + var2 - 1 - anInt410;
					anInt405 = -anInt405;
				}

				while (anInt410 >= var4) {
					anInt410 = var4 + var4 - 1 - anInt410;
					anInt405 = -anInt405;
					if (anInt410 >= var2) {
						return;
					}

					anInt410 = var2 + var2 - 1 - anInt410;
					anInt405 = -anInt405;
				}
			}
		} else {
			if (anInt411 > 0) {
				if (aBool51) {
					label118: {
						if (anInt405 < 0) {
							if (anInt410 >= var2) {
								return;
							}

							anInt410 = var2 + var2 - 1 - anInt410;
							anInt405 = -anInt405;
							if (--anInt411 == 0) {
								break label118;
							}
						}

						do {
							if (anInt410 < var4) {
								return;
							}

							anInt410 = var4 + var4 - 1 - anInt410;
							anInt405 = -anInt405;
							if (--anInt411 == 0) {
								break;
							}

							if (anInt410 >= var2) {
								return;
							}

							anInt410 = var2 + var2 - 1 - anInt410;
							anInt405 = -anInt405;
						} while (--anInt411 != 0);
					}
				} else {
					label150: {
						int var3;
						if (anInt405 < 0) {
							if (anInt410 >= var2) {
								return;
							}

							var3 = (var4 - 1 - anInt410) / var7;
							if (var3 >= anInt411) {
								anInt410 += var7 * anInt411;
								anInt411 = 0;
								break label150;
							}

							anInt410 += var7 * var3;
							anInt411 -= var3;
						} else {
							if (anInt410 < var4) {
								return;
							}

							var3 = (anInt410 - var2) / var7;
							if (var3 >= anInt411) {
								anInt410 -= var7 * anInt411;
								anInt411 = 0;
								break label150;
							}

							anInt410 -= var7 * var3;
							anInt411 -= var3;
						}

						return;
					}
				}
			}

			if (anInt405 < 0) {
				if (anInt410 < 0) {
					anInt410 = -1;
					method413();
					method174();
				}
			} else if (anInt410 >= var6) {
				anInt410 = var6;
				method413();
				method174();
			}
		}

	}

	public synchronized void method430(int var1) {
		anInt411 = var1;
	}

	public boolean method431() {
		return anInt410 < 0 || anInt410 >= ((NodeSub6Sub1) aNodeSub6_1).aByteArray23.length << 8;
	}

	void method432() {
		anInt408 = anInt407;
		anInt406 = Static.staticMethod367(anInt407, anInt415);
		anInt404 = Static.staticMethod370(anInt407, anInt415);
	}

}
