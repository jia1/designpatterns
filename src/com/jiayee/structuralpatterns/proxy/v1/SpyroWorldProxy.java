package com.jiayee.structuralpatterns.proxy.v1;

/**
 * A supposed virtual proxy which creates expensive objects (i.e. SpyroWorld) on demand.
 * <p>
 * Types of proxies include:
 *    1. Remote proxy (local representative for an object in another address space, aka ambassador)
 *    2. Virtual proxy (see above)
 *    3. Protection proxy (access control for the proxied object). Access control can get complex
 *    and SRP helps with maintainability and readability.
 *    4. Smart reference (replaces a bare pointer with more functionality e.g. caching, statistics)
 */
public class SpyroWorldProxy implements World {
  private final int numRows;

  private final int numCols;

  public SpyroWorldProxy(final int numRows, final int numCols) {
    this.numRows = numRows;
    this.numCols = numCols;
  }

  @Override
  public int getNumRows() {
    return numRows;
  }

  @Override
  public int getNumCols() {
    return numCols;
  }

  @Override
  public void draw(int row, int col) {
    final SpyroWorld spyroWorld = new SpyroWorld(this);
    spyroWorld.draw(row, col);
  }
}
