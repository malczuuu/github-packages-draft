# Github Packages Draft

Draft repository presenting how to build maven library in GitHub Actions and host it in GitHub Packages.

* See [`publish.yml`](./.github/workflows/publish.yml) workflow configuration. Note that `github.actor` and
  `secrets.GPR_TOKEN` are being assigned to `GPR_USER` and `GPR_TOKEN`. `GPR_TOKEN` is configured in **Settings >
  Security > Secrets and variables > Actions** in section _Repository secrets_.
* See [`build.gradle`](./build.gradle) (`publishing` section). **Note** that `GPR_USER` and `GPR_TOKEN` variables are
  being used.
* See [Packages](https://github.com/malczuuu/github-packages-draft/packages) page.

**`GPR_TOKEN`** is generated in **Settings > Developer settings > Personal access tokens > Tokens (classic)**. After
experiments, permissions `repo` and `write:packages` are required. Take into consideration token expiration.
